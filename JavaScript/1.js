let userScore = 0;
let compScore = 0;
let count = 0;
let gameOver = false;


const choices = document.querySelectorAll(".choice");
const msg = document.querySelector("#msg");
const userScorePara = document.querySelector("#user-score");
const compScorePara = document.querySelector("#computer-score");



const genCompChoice = () =>{
    const options = ["rock","paper","scissor"];
    let randIdx = Math.floor(Math.random()*3);
    return options[randIdx];
    //rock , paper , scissor
}

const drawGame = () =>{
    msg.innerText = "Game Was Drawn!";
    msg.style.backgroundColor = "#081b31";
}


const showWinner = (userWin, userChoice, compChoice) => {
    if (gameOver) return;

    if (userWin) {
        userScore++;
        userScorePara.innerText = userScore;
        msg.innerText = `You win! your ${userChoice} beats computer ${compChoice}`;
        msg.style.backgroundColor = "green";
    } else {
        compScore++;
        compScorePara.innerText = compScore;
        msg.innerText = `You lose! computer ${compChoice} beats your ${userChoice}`;
        msg.style.backgroundColor = "red";
    }

    // ✅ WINNING CONDITION
   if (userScore === 30) {
    msg.innerText = "🎉 YOU WON THE GAME!";
    msg.style.backgroundColor = "darkgreen";
    gameOver = true;

    setTimeout(() => {
        if (confirm("You won the game! 🎉\nPlay again?")) {
            resetGame();
        }
    }, 200);
} 
else if (compScore === 30) {
    msg.innerText = "😢 COMPUTER WON THE GAME!";
    msg.style.backgroundColor = "darkred";
    gameOver = true;

    setTimeout(() => {
        if (confirm("Computer won the game 😢\nPlay again?")) {
            resetGame();
        }
    }, 200);
}


};

const playGame = (userChoice)=>{
    const compChoice = genCompChoice();

    if(userChoice === compChoice){
        drawGame();
    }else{
        let userWin = true;
        if(userChoice === "rock"){
            userWin = compChoice === "paper"? false:true;
        }else if(userChoice === "paper"){
            userWin = compChoice === "scissor"? false:true;
        }else{
            userWin = compChoice === "rock"? false:true;
        }
        showWinner(userWin,userChoice,compChoice);
    }
}

choices.forEach((choice) => {
    choice.addEventListener("click", () => {
        if (gameOver) return; // ⛔ stop game

        const userChoice = choice.getAttribute("id");
        playGame(userChoice);
    });
});

const resetGame = () => {
    userScore = 0;
    compScore = 0;
    gameOver = false;

    userScorePara.innerText = 0;
    compScorePara.innerText = 0;

    msg.innerText = "Play your move";
    msg.style.backgroundColor = "#081b31";
};
