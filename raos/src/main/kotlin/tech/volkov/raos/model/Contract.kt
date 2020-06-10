package tech.volkov.raos.model

class Landlord : ContractMember()

class Tenant : ContractMember()

abstract class ContractMember {
    lateinit var name: String
    lateinit var passport: String
}

class Apartment {
    lateinit var name: String
    lateinit var address: String
    var area: Int = 0
    var priceInWeiPerNight: Int = 0
}