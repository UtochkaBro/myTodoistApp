package com.example.mytodoist.data

interface ShopListRepository {

    fun addShopItemUseCase(shopItem: ShopItem)

    fun deleteShopItemUseCase(shopItem: ShopItem)

    fun editShopItemUseCase(shopItem: ShopItem)

    fun getShopItemUseCase(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>
}

