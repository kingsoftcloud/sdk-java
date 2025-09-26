package ksyun.client.cdn.refreshcaches.v20160901;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RefreshCachesRequest
* @Description 请求参数
*/
@Data
public class RefreshCachesRequest{
    /**Files*/
    @KsYunField(name="Files")
    private String Files;

    /**Dirs*/
    @KsYunField(name="Dirs")
    private String Dirs;

}