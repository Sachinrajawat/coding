// Object destructuring
const band = {
    bandName: "led zepplin",
    famousSong: "stairway to heaven",
    year: 1986,
    anotherFamousSong: "kashmir",
};
// const bandName = band.bandName;
// const famousSong = band.famousSong;
// console.log(bandName,famousSong);

// const {bandName, famousSong} = band;
// console.log(bandName);

// const {bandName:var1, famousSong: var2} = band;
// console.log(var1);

const {bandName, famousSong, ...restProp} = band;
console.log(restProp);