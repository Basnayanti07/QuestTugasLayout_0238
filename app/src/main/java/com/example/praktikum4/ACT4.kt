package com.example.praktikum4

import androidx.compose.ui.text.font.FontFamily
import androidx.annotation.ColorRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.integerResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

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
        Row(
            modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_isi_kartu)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = stringResource(id = R.string.desc_logo),
                modifier = Modifier.size(dimensionResource(id = R.dimen.ukuran_logo))
            )
            Spacer(modifier = Modifier.width(dimensionResource(id = R.dimen.spasi_logo_teks)))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = stringResource(id = nama),
                    fontSize = integerResource(id = R.integer.font_nama).sp,
                    fontFamily = fontNama,
                    fontWeight = beratNama,
                    color = colorResource(id = R.color.teks_putih)
                )
                if (telepon != null) {
                    Text(
                        text = stringResource(id = telepon),
                        fontSize = integerResource(id = R.integer.font_detail).sp,
                        color = colorResource(id = R.color.teks_cyan)
                    )
                }
                Text(
                    text = stringResource(id = alamat),
                    fontSize = integerResource(id = R.integer.font_detail).sp,
                    color = colorResource(id = warnaAlamat)
                )
            }
            Spacer(modifier = Modifier.width(dimensionResource(id = R.dimen.spasi_logo_teks)))
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = stringResource(id = R.string.desc_logo),
                modifier = Modifier.size(dimensionResource(id = R.dimen.ukuran_logo))
            )
        }
    }
}

@Composable
fun TugasLayout(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = dimensionResource(id = R.dimen.padding_atas)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.prodi),
                fontSize = integerResource(id = R.integer.font_judul).sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(id = R.string.univ),
                fontSize = integerResource(id = R.integer.font_univ).sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.padding(dimensionResource(id = R.dimen.spasi_judul)))
            KartuProfil(
                nama = R.string.nama_1,
                alamat = R.string.alamat_1,
                warnaKartu = R.color.card_abu,
                warnaAlamat = R.color.teks_Kuning,
                fontNama = FontFamily.Cursive
            )
            KartuProfil(
                nama = R.string.nama_2,
                telepon = R.string.telp_2,
                alamat = R.string.alamat_2,
                warnaKartu = R.color.card_ungu,
                warnaAlamat = R.color.teks_Kuning,
                beratNama = FontWeight.Bold
            )
            KartuProfil(
                nama = R.string.nama_3,
                telepon = R.string.telp_3,
                alamat = R.string.alamat_3,
                warnaKartu = R.color.card_biru,
                warnaAlamat = R.color.teks_putih,
                beratNama = FontWeight.Bold
            )
            KartuProfil(
                nama = R.string.nama_4,
                telepon = R.string.telp_4,
                alamat = R.string.alamat_4,
                warnaKartu = R.color.card_hijau,
                warnaAlamat = R.color.teks_putih,
                beratNama = FontWeight.Bold
            )
        }
        Text(
            text = stringResource(id = R.string.copy),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = dimensionResource(id = R.dimen.padding_bawah_copy))
        )
    }
}