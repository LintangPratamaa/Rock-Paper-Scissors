package com.lintang.rockpaperscissors

fun main() {

    var computerChoice = ""
    var playerChoice = ""
    println("Choose Rock, Paper, or Scissors")
    while( playerChoice != "Rock" && playerChoice != "Paper" && playerChoice != "Scissors") {
        print("Player Choice : ")
        playerChoice = readln()
    }

    var randomNumber = (1 .. 3).random()
    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }
    println("Computer Choice : $computerChoice")

    val result = when {
        playerChoice == computerChoice -> "Tie"
        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"
        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"
        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"
        else -> "Computer"
    }
    if (result == "Tie") {
        println("The Result : Tie")
    } else {
        println("The Result : $result Win!!")
    }
}