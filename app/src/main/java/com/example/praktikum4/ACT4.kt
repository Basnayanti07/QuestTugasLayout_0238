package com.example.praktikum4

import android.graphics.fonts.FontFamily
import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight

@Composable
fun KartuProfil(
    @StringRes nama: Int,
    @StringRes alamat: Int,
    @ColorRes warnaKartu: Int,
    @ColorRes warnaAlamat: Int,
    modifier: Modifier = Modifier,
    @StringRes telepon: Int? = null,
    fontNama: FontFamily? = null,
    beratNama: FontWeight? = null
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(dimensionResource(id = R.dimen.padding_kartu)),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(id = warnaKartu)
        )
    ){

    }
}