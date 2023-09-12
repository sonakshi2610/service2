package com.craftdemo.service2.exceptions;

import com.craftdemo.requestfilter.exceptions.GlobalExceptionHandler;
import com.craftdemo.service2.controller.FailController;
import com.craftdemo.service2.controller.SuccessController;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice(assignableTypes = {FailController.class, SuccessController.class})
public class ExceptionTranslator extends GlobalExceptionHandler {
}
