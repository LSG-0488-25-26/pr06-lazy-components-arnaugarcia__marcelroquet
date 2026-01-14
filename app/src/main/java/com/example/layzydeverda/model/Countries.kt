package com.example.layzydeverda.model

import com.example.layzydeverda.R

class CountryList {
    fun getCountries(): List<Country> {
        return listOf(
            Country("Spain", "Madrid", "Europe", 47351567,  R.drawable.es),
            Country("France", "Paris", "Europe", 67391582, R.drawable.fr),
            Country("Germany", "Berlin", "Europe", 83240525, R.drawable.de),
            Country("Italy", "Rome", "Europe", 60317116, R.drawable.it),
            Country("Japan", "Tokyo", "Asia", 125960000, R.drawable.jp),
            Country("Canada", "Ottawa", "America", 38005238, R.drawable.ca),
            Country("Brazil", "Brasília", "America", 215353593, R.drawable.br),
            Country("Australia", "Canberra", "Oceania", 25687041, R.drawable.au)
        )
    }
}