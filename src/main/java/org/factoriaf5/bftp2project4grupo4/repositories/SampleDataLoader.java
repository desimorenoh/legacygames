package org.factoriaf5.bftp2project4grupo4.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SampleDataLoader {

    private JuegoRepository juegoRepository;

    @Autowired
    public SampleDataLoader(JuegoRepository juegoRepository) {
        this.juegoRepository = juegoRepository;
    }

    @PostConstruct
    public void loadSampleData() {
        juegoRepository.saveAll(List.of(

                new Juego("Wii Sports","https://www.gamulator.com/img/roms/wii-sports-nintendo-wii-cover.jpg","Wii", 2006, 19.99,0,19.99,"Sports", "Nintendo", 7,"sf"),
                new Juego("Super Mario Bros.","https://www.mobygames.com/images/covers/l/104935-super-mario-bros-game-boy-advance-front-cover.jpg","NES",1985, 14.99, 0,0,"Platform","Nintendo",7,""),
                new Juego ("Nintendogs","https://www.mobygames.com/images/covers/l/200680-nintendogs-nintendo-ds-front-cover.jpg","DS",2005, 29.99,0,0,"Simulation","Nintendo",3,"suitable for kids"),
                new Juego("Mario Kart DS","https://www.mobygames.com/images/covers/l/285423-mario-kart-8-wii-u-front-cover.jpg","DS",2005,19.99,0,19.99,"Racing","Nintendo",7,""),
                new Juego("Pokemon Gold/Pokemon Silver","https://www.mobygames.com/images/covers/l/51564-pokemon-gold-version-game-boy-color-front-cover.jpg", "GB", 1999, 24.99, 0, 24.99, "Role-Playing","Nintendo", 7,""),
                new Juego("Wii Fit", "https://www.mobygames.com/images/covers/l/123314-wii-fit-wii-other.jpg", "Wii", 2007, 9.99, 0, 9.99, "Sports", "Nintendo", 3, "suitable for kids"),
                new Juego("Wii Fit Plus", "https://www.mobygames.com/images/covers/l/201385-wii-fit-plus-wii-other.jpg", "Wii", 2009, 8.99, 0, 8.99, "Sports", "Nintendo", 3, "suitable for kids"),
                new Juego("Kinect Adventures!", "https://www.mobygames.com/images/covers/l/554502-kinect-adventures-xbox-360-front-cover.jpg", "X360", 2010, 12.99, 0, 12.99, "Misc", "Microsoft Game Studios",7,""),
                new Juego("Grand Theft Auto V", "https://www.rockstargames.com/V/img/global/order/mobile-cover.jpg", "PS3", 2013, 24.99, 0, 24.99, "Action","Take-Two Interactive", 18, "extreme violence"),
                new Juego("Grand Theft Auto: San Andreas", "https://www.mobygames.com/images/covers/l/43133-grand-theft-auto-san-andreas-playstation-2-front-cover.jpg", "PS2", 2004, 24.99, 10, 22.49, "Action", "Take-Two Interactive", 18, "extreme violence"),
                new Juego("Super Mario World", "https://static-cdn.jtvnw.net/ttv-boxart/1229_IGDB-285x380.jpg", "SNES", 1990, 49.99, 10, 44.99, "Platform", "Nintendo", 7,"")
        ));
    }
}