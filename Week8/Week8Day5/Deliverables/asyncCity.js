async function main() {
    const num = await getRandomNumber();
    console.log(num);
}
main();
async function fetchCityData(city) {
    const response = await fetch(
        `https://geocode.xyz/${city}?json=1`
    );
    const data = await response.json();
    console.log(`${city} is logcated at ${data.latt} lattitude, & ${data.longt} longitude`);
}
// fetchCityData('Mufreesboro');
fetchCityData('Chattanooga');