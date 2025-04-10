package app.model;

public class Cell {
    private Player player = Player.NONE;
    private CellObserver observer;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
        if(observer != null){
            observer.update(player);
        }
    }
    public void setObserver(CellObserver observer){
        this.observer = observer;

    }
}

