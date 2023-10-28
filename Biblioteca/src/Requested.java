public class Requested {
    int idUserRequest;
    int idBooksRequest;

    public Requested(int idUserRequest, int idBooksRequest) {
        this.idUserRequest = idUserRequest;
        this.idBooksRequest = idBooksRequest;
    }

    public int getIdUserRequest() {
        return idUserRequest;
    }

    public int getIdBooksRequest() {
        return idBooksRequest;
    }
}
