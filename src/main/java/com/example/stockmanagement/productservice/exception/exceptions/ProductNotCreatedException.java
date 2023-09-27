package com.example.stockmanagement.productservice.exception.exceptions;

import com.example.stockmanagement.productservice.enums.Language;
import com.example.stockmanagement.productservice.exception.enums.IFriendlyMessageCode;
import com.example.stockmanagement.productservice.exception.utils.FriendlyMessageUtils;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class ProductNotCreatedException extends  RuntimeException{

    private  final Language language;

    private  final IFriendlyMessageCode frendlyMessageCode;


    public ProductNotCreatedException(Language language, IFriendlyMessageCode frendlyMessageCode, String message) {
        super(FriendlyMessageUtils.getFriendlyMessage(language,frendlyMessageCode));
        this.language = language;
        this.frendlyMessageCode = frendlyMessageCode;
        log.error("[ProductNotCreatedException] -> message: {} developper message: {}",FriendlyMessageUtils.getFriendlyMessage(language,frendlyMessageCode),message);
    }
}
