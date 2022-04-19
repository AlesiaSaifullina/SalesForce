package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Account {
    String accountName;
    String parentAccountName;
    String website;
    String phone;
    String fax;
    String employees;
    String revenue;
    String city;
    String state;
    String zipCode;
    String country;
    String type;
    String industryType;
    String description;
    String billingStreet;
    String shippingStreet;
}