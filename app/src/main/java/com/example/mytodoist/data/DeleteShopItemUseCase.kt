package com.example.mytodoist.data

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun deleteShopItemUseCase(shopItem: ShopItem) {
        shopListRepository.deleteShopItemUseCase(shopItem)
    }
}