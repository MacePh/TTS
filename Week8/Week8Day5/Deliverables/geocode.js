// async function getCity(city) {
//     // const res = await fetch('https://geocode.xyz/${city}?json=1');
//     const res = await fetch('https://geocode.xyz/?scantext={${city}}&outputformathttps://geocode.xyz/${city}?json=1');

//     const data = await res.json();
//     console.log('Located at ${latt} lattitude & ${longt} longitude');
// }
// getCity("seatle");
function geocodeAddress() {
    const address = document.getElementById("address").value;
    if (!address || address.length < 3) {
        console.log("The address string is too short. Enter at least three symbols");
        return;
    }

    const geocodingUrl = `https://api.geoapify.com/v1/geocode/search?text=${encodeURIComponent(address)}&apiKey=${129340993996529e15930856x91430
}`;

    // call Geocoding API - https://www.geoapify.com/geocoding-api/
    fetch(geocodingUrl).then(result => result.json())
        .then(featureCollection => {
            console.log(featureCollection);
        });
}