package ksyun.client.resourcemanager.listfolders.v20210320;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListFoldersResponse
* @Description ListFolders 返回体
*/
@Data
@ToString
public class ListFoldersResponse extends BaseResponseModel {
    /**资源夹名称*/
    @JsonProperty("Name")
    private String Name;

    /**资源夹备注*/
    @JsonProperty("Desc")
    private String Desc;

    /**资源夹ID*/
    @JsonProperty("Id")
    private String Id;

    /**资源夹创建时间*/
    @JsonProperty("CreatedTime")
    private String CreatedTime;

    /**资源夹层级*/
    @JsonProperty("Level")
    private Integer Level;

    /**父级资源夹ID*/
    @JsonProperty("ParentId")
    private Integer ParentId;

    /**资源夹成员数量*/
    @JsonProperty("Num")
    private Integer Num;

    /**子级资源夹列表*/
    @JsonProperty("SonFolder")
    private List<SonFolderDto> SonFolder;

    @Data
    @ToString
    public static class SonFolderDto {
        /**资源夹名称*/
        @JsonProperty("Name")
        private String Name;

        /**备注*/
        @JsonProperty("Desc")
        private String Desc;

        /**资源夹ID*/
        @JsonProperty("Id")
        private String Id;

        /**资源夹创建时间*/
        @JsonProperty("CreatedTime")
        private String CreatedTime;

        /**资源夹层级*/
        @JsonProperty("Level")
        private Integer Level;

        /**父级资源夹ID*/
        @JsonProperty("ParentId")
        private String ParentId;

        /**资源夹成员数量*/
        @JsonProperty("Num")
        private Integer Num;

        /**子资源夹列表*/
        @JsonProperty("SonFolder")
        private List<SonFolderDto> SonFolder;

        @Data
        @ToString
        public static class SonFolderDto {
        }

    }

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
