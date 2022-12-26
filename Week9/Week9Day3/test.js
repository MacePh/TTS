//tic-tac-toe
// 1. Create a tic-tac-toe game
// 2. Create a 3x3 grid
const grid = [
    ["X", "O", "X"],
    ["O", "X", "X"],
    ["O", "O", "X"]
];
// 3. Create a function that will check if a player has won
// 4. Create a function that will check if the game is a draw
// 5. Create a function that will check if the game is over
// 6. Create a function that will check if the game is in progress
// 7. Create a function that will check if the game is not started
// 8. Create a function that will check if a player has won


const checkIfPlayerHasWon = (grid, player) => {
    const horizontal = grid.map(row => row.filter(cell => cell === player));
    const vertical = grid.map((row, index) => grid.map(row => row[index]).filter(cell => cell === player));
    const diagonal = [
        grid.map((row, index) => row[index]).filter(cell => cell === player),
        grid.map((row, index) => row[row.length - 1 - index]).filter(cell => cell === player)
    ];
    const result = horizontal.concat(vertical).concat(diagonal);
    return result.some(row => row.length === grid.length);
};

const checkIfGameIsADraw = (grid, player) => {
    const horizontal = grid.map(row => row.filter(cell => cell === player));
    const vertical = grid.map((row, index) => grid.map(row => row[index]).filter(cell => cell === player));
    const diagonal = [
        grid.map((row, index) => row[index]).filter(cell => cell === player),
        grid.map((row, index) => row[row.length - 1 - index]).filter(cell => cell === player)
    ];
    const result = horizontal.concat(vertical).concat(diagonal);
    return result.every(row => row.length === grid.length);
};

const checkIfGameOver = (grid, player) => {
    const horizontal = grid.map(row => row.filter(cell => cell === player));
    const vertical = grid.map((row, index) => grid.map(row => row[index]).filter(cell => cell === player));
    const diagonal = [
        grid.map((row, index) => row[index]).filter(cell => cell === player),
        grid.map((row, index) => row
// 2. Create a 3x3 grid
// 3. Create a function that will check if a player has won
// 4. Create a function that will check if the game is a draw
// 5. Create a function that will check if the game is over
// 6. Create a function that will check if the game is in progress
// 7. Create a function that will check if the game is not started
// 8. Create a function that will check if a player has won

