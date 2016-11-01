package competition.bg.softuni.bean.user;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import competition.bg.softuni.model.user.RegisteredCompetitor;

@ManagedBean(name = "RegisteredCompetitors")
@ApplicationScoped
public class RegisteredCompetitors {
    private List<RegisteredCompetitor> competitors;

    @PostConstruct
    public void init() {
        competitors = new ArrayList<RegisteredCompetitor>();
    }

    public List<RegisteredCompetitor> getCompetitors() {
        return competitors;
    }

    public void setCompetitors(List<RegisteredCompetitor> competitors) {
        this.competitors = competitors;
    }
}
