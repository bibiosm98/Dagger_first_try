package com.example.dagger_first_try

import javax.inject.Inject

class Wheels @Inject constructor(val rims: Rims, val tires: Tires) {
}