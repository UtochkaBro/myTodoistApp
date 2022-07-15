package com.example.mytodoist.data

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItemUseCase(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItemUseCase(shopItemId)
    }
}