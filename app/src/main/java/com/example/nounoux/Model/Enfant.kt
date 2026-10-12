package com.example.nounoux.Model

import java.time.YearMonth
import java.time.format.DateTimeParseException

/**
 * class Enfant data qui stocke les infos des enfants ainsi que les fonctions associés utile pour obtenir des infos comme les présences
 * @property id identifiant qui représente l'enfant
 * @property nom qui est le nom de l'enfant
 * @property prenom qui est le prenom de l'enfant
 * @property presences qui est toutes les présences de l'enfant
 **/
data class Enfant(
    val id: Int,
    var nom: String,
    var prenom: String
) {

    var presences: HashMap<YearMonth, MutableList<Presence>> = hashMapOf()

    /**
     * méthode pour convertir les chaines de caractères en YearMonth un objet java
     * @param date la date en String
     * @return la date en format yearmonth
     * @throws DateFormatException Conversion impossible
     **/
    fun StringtoYearMonth(date: String): YearMonth {
        //TODO
        return
    }
    /**
     * méthode pour convertir les YearMonth en String
     * @param date la date en YearMonth
     * @return la date en format String
     * @throws DateFormatException Conversion impossible
     **/
    fun YearMonthtoString(date: YearMonth): String {
        //TODO
        return
    }
}