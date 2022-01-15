package design_patterns.facade;

/**
 * PROS:
 * gives clients the option of using a simple API for a specific use
 * clients are unaware of changes
 * facede can be passed to get to the more complex options
 */
public class BasketballFacade {
    private static final int[] FT_COOR = {10, 10};
    private BasketballPlayer player = new BasketballPlayer();

    public void doFreeThrow(){
        player.moveTo(FT_COOR);
        player.freeThrowStand();
        player.throwBall();
    }
}
