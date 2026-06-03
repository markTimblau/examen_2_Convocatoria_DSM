package com.example.dsmconvocatoria2.models

sealed class Genere(val nom: String) {
    object Novella : Genere("Novel·la")
    object Assaig : Genere("Assaig")
    object Comic : Genere("Còmic")
}
