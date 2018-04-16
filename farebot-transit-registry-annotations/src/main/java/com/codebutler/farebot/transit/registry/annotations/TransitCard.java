package com.codebutler.farebot.transit.registry.annotations;

import com.uber.crumb.annotations.CrumbProducer;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

@Target(TYPE)
@Retention(CLASS)
@CrumbProducer
public @interface TransitCard {
  CardType value();
}