package id.startapp.currencyexchange

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform