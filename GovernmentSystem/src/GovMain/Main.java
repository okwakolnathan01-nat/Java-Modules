package GovMain;

import GovTax.*;
import GovNationalID.*;
import GovPassport.*;
import GovBusiness.*;

public class Main {
    public static void main(String[] args) {
        new TaxService().process();
        new NationalIDService().process();
        new PassportService().process();
        new BusinessService().process();
    }
}
