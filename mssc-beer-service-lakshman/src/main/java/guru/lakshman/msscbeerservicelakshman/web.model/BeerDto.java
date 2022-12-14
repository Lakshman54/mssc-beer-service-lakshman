package guru.lakshman.msscbeerservicelakshman.web.model;

import java.math.BigDecimal;
import java.util.UUID;

public class BeerDto {

    private UUID id;
    private Integer version;

    //  private OffsetDateTime createdDate;
    //  private OffsetDateTime lastModifiedDate;

    private String beerName;

    private BeerStyleEnum beerStyle;

    private Long upc;

    private BigDecimal price;
    private Integer quantityOnHand;


}