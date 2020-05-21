public class Factory {
public Movie getMovie(String desiredMovie){
if (desiredMovie==null){
    return null;
}
if (desiredMovie.equalsIgnoreCase("shrek")){
    return new Shrek();
}
    if (desiredMovie.equalsIgnoreCase("TITANIC")){
        return new Titanic();
    }
    if (desiredMovie.equalsIgnoreCase("InCePtIoN")){
        return new Inception();
    }
    return null;
}


}
