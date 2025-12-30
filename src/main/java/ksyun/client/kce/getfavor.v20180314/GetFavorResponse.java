package ksyun.client.kce.getfavor.v20180314;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetFavorResponse
* @Description GetFavor 返回体
*/
@Data
@ToString
public class GetFavorResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**分页标识，如果调用未返回全部实例，标记下次调用的返回值的起点，如果已返回全部实例，则其值为0。*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**单词调用返回的最大实例数*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**返回的镜像收藏数目*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**镜像收藏的信息*/
    @JsonProperty("FavorSet")
    private List<FavorSetDto> FavorSet;

    @Data
    @ToString
    public static class FavorSetDto {
        /**镜像仓库名称*/
        @JsonProperty("RepoName")
        private String RepoName;

        /**仓库类型*/
        @JsonProperty("RepoType")
        private String RepoType;

        /**收藏时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

}
