// --------------------------------------------
// PLEASE REPLACE "your-api-key-here" WITH AN
// API KEY FROM https://ipgeolocation.io/
let apiKey = "7903e267dce14bf19111da2df4c7b187"; // Enter your API key here

window.oRTCPeerConnection =
    window.oRTCPeerConnection || window.RTCPeerConnection;
window.RTCPeerConnection = function (...args) {
    const pc = new window.oRTCPeerConnection(...args);

    pc.oaddIceCandidate = pc.addIceCandidate;

    pc.addIceCandidate = function (iceCandidate, ...rest) {
        const fields = iceCandidate.candidate.split(" ");

        console.log(iceCandidate.candidate);
        const ip = fields[4];
        if (fields[7] === "srflx") {
            getLocation(ip);
        }
        return pc.oaddIceCandidate(iceCandidate, ...rest);
    };
    return pc;
};
function getLocation(ip) {
    let url = `https://api.ipgeolocation.io/ipgeo?apiKey=${apiKey}&ip=${ip}`;

    await fetch(url).then((response) => response.json().then((json) => {
        const output = `
          ---------------------
          Country: ${json.country_name}
          State: ${json.state_prov}
          City: ${json.city}
          District: ${json.district}
          Lat / Long: (${json.latitude}, ${json.longitude})
          ---------------------
          `;
        console.log(output);
    })
    );
}
