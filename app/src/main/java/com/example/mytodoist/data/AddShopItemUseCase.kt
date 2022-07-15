package com.example.mytodoist.data

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun addShopItemUseCase(shopItem: ShopItem){
        shopListRepository.addShopItemUseCase(shopItem)
    }
}