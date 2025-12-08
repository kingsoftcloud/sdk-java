package ksyun.client.krds.getcurrentdatabaseinfo.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetCurrentDatabaseInfoResponse
* @Description GetCurrentDatabaseInfo 返回体
*/
@Data
@ToString
public class GetCurrentDatabaseInfoResponse extends BaseResponseModel {
    /**实例数据库表信息返回数据域*/
    @JsonProperty("Databases")
    private List<DatabasesDto> Databases;

    @Data
    @ToString
    public static class DatabasesDto {
        /**数据库名称*/
        @JsonProperty("DatabaseName")
        private String DatabaseName;

        /**数据表列表*/
        @JsonProperty("TableNames")
        private List<String> TableNames;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
