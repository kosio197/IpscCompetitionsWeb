package bg.softuni.bean;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import bg.softuni.service.CountryService;

@ManagedBean(name = "countriesBean")
@ApplicationScoped
public class CountriesBean {
    @EJB
    CountryService countryService;

    private List<String> countries;

    @PostConstruct
    public void init() {
        countries = countryService.getAllCountries();
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }
}
