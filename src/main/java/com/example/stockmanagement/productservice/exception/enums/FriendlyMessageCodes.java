package com.example.stockmanagement.productservice.exception.enums;

public enum FriendlyMessageCodes implements IFriendlyMessageCode {
    OK(1000) ,

    SUCCES(1002),
    ERROR(1001),

    PRODUCT_SUCCESSFULLY_CREATED(1501),
    PRODUCT_NOT_CREATED_EXCEPTION(1500),

    PRODUCT_NOT_FOUND_EXCEPTION(1502),
    PRODUCT_SUCCESSFULLY_UPDATED(1503);
   private  final int  value;

   FriendlyMessageCodes(int value) {
       this.value=value;
   }

    @Override
    public int getFrendlyMessageCode() {
        return value;
    }
}

/*
logging:
        level:
        root: off
        com.example : DEBUG

 */