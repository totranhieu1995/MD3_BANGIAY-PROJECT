package ra.controller.cart;

import ra.controller.IGenericController;
import ra.model.entity.Cart;
import ra.model.entity.CartItem;

public interface IControllerCart extends IGenericController<Cart> {
    void addToCart(CartItem cartItem);
}
