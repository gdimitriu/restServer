package restserver.server.forms;

import org.springframework.web.multipart.MultipartFile;

public class MultipartFormDataBody {

    private String key;

    private String actor;

    private MultipartFile file1;

    private MultipartFile file2;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public MultipartFile getFile1() {
        return file1;
    }

    public void setFile1(MultipartFile data) {
        this.file1 = data;
    }

    public MultipartFile getFile2() {
        return file2;
    }

    public void setFile2(MultipartFile data) {
        this.file2 = data;
    }
}
