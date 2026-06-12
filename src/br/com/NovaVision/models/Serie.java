package br.com.NovaVision.models;

public class Serie extends Titles{

    int seasons;
    int epsodiesBySeason;
    boolean finished;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpsodiesBySeason() {
        return epsodiesBySeason;
    }

    public void setEpsodiesBySeason(int epsodiesBySeason) {
        this.epsodiesBySeason = epsodiesBySeason;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}
