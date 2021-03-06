package org.devict.jlib.beanutils;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created by developerSid on 5/12/17.
 */
public class BeanTwo
{
   private String propertyOne;
   private String propertyTwo;
   private Long propertyThree;
   private String propertyFour;

   public String getPropertyOne() {
      return propertyOne;
   }

   public void setPropertyOne(String propertyOne) {
      this.propertyOne = propertyOne;
   }

   public String getPropertyTwo() {
      return propertyTwo;
   }

   public void setPropertyTwo(String propertyTwo) {
      this.propertyTwo = propertyTwo;
   }

   public Long getPropertyThree() {
      return propertyThree;
   }

   public void setPropertyThree(Long propertyThree) {
      this.propertyThree = propertyThree;
   }

   @Override
   public String toString() {
      return ToStringBuilder.reflectionToString(this);
   }
}
