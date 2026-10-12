
package com.example.nounoux.Model

import java.time.LocalTime

/**
 * class qui Représente la présence prévue d'un enfant pour une journée donnée.
 * @property id Identifiant unique de la présence.
 * @property date Date à laquelle la présence est prévue.
 * @property hrarrive Heure d'arrivée de l'enfant, ou null si
 * l'arrivée n'a pas été enregistrée.
 * @property hrdepart Heure de départ de l'enfant, ou null si
 * le départ n'a pas été enregistré.
 */
data class Presence(
    val id: Int,
    val date: String,
    var hrarrive: LocalTime? = null,
    var hrdepart: LocalTime? = null
) {

    /**
     * Indique si l'enfant est venu ce jour-là.
     *
     * L'arrivée doit avoir été enregistrée pour que l'enfant
     * soit considéré comme présent.
     *
     * @return true si une heure d'arrivée est renseignée,
     * false sinon.
     */
    fun isPresent(): Boolean {
        return hrarrive != null
    }

    /**
     * Indique si l'enfant est actuellement encore présent.
     *
     * L'enfant doit être arrivé et son heure de départ
     * ne doit pas encore être renseignée.
     *
     * @return true si l'enfant est arrivé et n'est pas encore
     * parti, false sinon.
     */
    fun isEncorePresent(): Boolean {
        return hrarrive != null && hrdepart == null
    }
}
