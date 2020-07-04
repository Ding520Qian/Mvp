package com.example.azheng.rxjavamvpdemo.bean;

import java.util.List;

public class WeatherBean {

    /**
     * message : success感谢又拍云(upyun.com)提供CDN赞助
     * status : 200
     * date : 20200703
     * time : 2020-07-03 17:29:02
     * cityInfo : {"city":"北京市","citykey":"101010100","parent":"北京","updateTime":"16:01"}
     * data : {"shidu":"61%","pm25":82,"pm10":0,"quality":"轻度","wendu":"29","ganmao":"儿童、老年人及心脏、呼吸系统疾病患者人群应减少长时间或高强度户外锻炼","forecast":[{"date":"03","high":"高温 27℃","low":"低温 21℃","ymd":"2020-07-03","week":"星期五","sunrise":"04:51","sunset":"19:47","aqi":97,"fx":"东北风","fl":"1级","type":"中雨","notice":"记得随身携带雨伞哦"},{"date":"04","high":"高温 28℃","low":"低温 21℃","ymd":"2020-07-04","week":"星期六","sunrise":"04:51","sunset":"19:46","aqi":83,"fx":"西南风","fl":"2级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"05","high":"高温 29℃","low":"低温 21℃","ymd":"2020-07-05","week":"星期日","sunrise":"04:52","sunset":"19:46","aqi":50,"fx":"西风","fl":"2级","type":"中雨","notice":"记得随身携带雨伞哦"},{"date":"06","high":"高温 31℃","low":"低温 23℃","ymd":"2020-07-06","week":"星期一","sunrise":"04:52","sunset":"19:46","aqi":29,"fx":"东北风","fl":"1级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"07","high":"高温 32℃","low":"低温 23℃","ymd":"2020-07-07","week":"星期二","sunrise":"04:53","sunset":"19:46","aqi":57,"fx":"东南风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"08","high":"高温 31℃","low":"低温 23℃","ymd":"2020-07-08","week":"星期三","sunrise":"04:54","sunset":"19:45","aqi":59,"fx":"东南风","fl":"2级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"09","high":"高温 28℃","low":"低温 23℃","ymd":"2020-07-09","week":"星期四","sunrise":"04:54","sunset":"19:45","aqi":34,"fx":"东风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"10","high":"高温 27℃","low":"低温 20℃","ymd":"2020-07-10","week":"星期五","sunrise":"04:55","sunset":"19:45","aqi":27,"fx":"东北风","fl":"3级","type":"大雨","notice":"出门最好穿雨衣，勿挡视线"},{"date":"11","high":"高温 30℃","low":"低温 20℃","ymd":"2020-07-11","week":"星期六","sunrise":"04:56","sunset":"19:44","aqi":6,"fx":"西风","fl":"3级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"12","high":"高温 30℃","low":"低温 19℃","ymd":"2020-07-12","week":"星期日","sunrise":"04:56","sunset":"19:44","aqi":28,"fx":"西南风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"13","high":"高温 32℃","low":"低温 21℃","ymd":"2020-07-13","week":"星期一","sunrise":"04:57","sunset":"19:43","aqi":25,"fx":"西风","fl":"2级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"14","high":"高温 34℃","low":"低温 21℃","ymd":"2020-07-14","week":"星期二","sunrise":"04:58","sunset":"19:43","aqi":56,"fx":"南风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"15","high":"高温 31℃","low":"低温 21℃","ymd":"2020-07-15","week":"星期三","sunrise":"04:59","sunset":"19:42","aqi":74,"fx":"东南风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"16","high":"高温 35℃","low":"低温 21℃","ymd":"2020-07-16","week":"星期四","sunrise":"04:59","sunset":"19:41","aqi":85,"fx":"东南风","fl":"2级","type":"中雨","notice":"记得随身携带雨伞哦"}]}
     */

    private String message;
    private int status;
    private String date;
    private String time;
    private CityInfoBean cityInfo;
    private DataBean data;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public CityInfoBean getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfoBean cityInfo) {
        this.cityInfo = cityInfo;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class CityInfoBean {
        /**
         * city : 北京市
         * citykey : 101010100
         * parent : 北京
         * updateTime : 16:01
         */

        private String city;
        private String citykey;
        private String parent;
        private String updateTime;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCitykey() {
            return citykey;
        }

        public void setCitykey(String citykey) {
            this.citykey = citykey;
        }

        public String getParent() {
            return parent;
        }

        public void setParent(String parent) {
            this.parent = parent;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }
    }

    public static class DataBean {
        /**
         * shidu : 61%
         * pm25 : 82.0
         * pm10 : 0.0
         * quality : 轻度
         * wendu : 29
         * ganmao : 儿童、老年人及心脏、呼吸系统疾病患者人群应减少长时间或高强度户外锻炼
         * forecast : [{"date":"03","high":"高温 27℃","low":"低温 21℃","ymd":"2020-07-03","week":"星期五","sunrise":"04:51","sunset":"19:47","aqi":97,"fx":"东北风","fl":"1级","type":"中雨","notice":"记得随身携带雨伞哦"},{"date":"04","high":"高温 28℃","low":"低温 21℃","ymd":"2020-07-04","week":"星期六","sunrise":"04:51","sunset":"19:46","aqi":83,"fx":"西南风","fl":"2级","type":"阴","notice":"不要被阴云遮挡住好心情"},{"date":"05","high":"高温 29℃","low":"低温 21℃","ymd":"2020-07-05","week":"星期日","sunrise":"04:52","sunset":"19:46","aqi":50,"fx":"西风","fl":"2级","type":"中雨","notice":"记得随身携带雨伞哦"},{"date":"06","high":"高温 31℃","low":"低温 23℃","ymd":"2020-07-06","week":"星期一","sunrise":"04:52","sunset":"19:46","aqi":29,"fx":"东北风","fl":"1级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"07","high":"高温 32℃","low":"低温 23℃","ymd":"2020-07-07","week":"星期二","sunrise":"04:53","sunset":"19:46","aqi":57,"fx":"东南风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"08","high":"高温 31℃","low":"低温 23℃","ymd":"2020-07-08","week":"星期三","sunrise":"04:54","sunset":"19:45","aqi":59,"fx":"东南风","fl":"2级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"09","high":"高温 28℃","low":"低温 23℃","ymd":"2020-07-09","week":"星期四","sunrise":"04:54","sunset":"19:45","aqi":34,"fx":"东风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"10","high":"高温 27℃","low":"低温 20℃","ymd":"2020-07-10","week":"星期五","sunrise":"04:55","sunset":"19:45","aqi":27,"fx":"东北风","fl":"3级","type":"大雨","notice":"出门最好穿雨衣，勿挡视线"},{"date":"11","high":"高温 30℃","low":"低温 20℃","ymd":"2020-07-11","week":"星期六","sunrise":"04:56","sunset":"19:44","aqi":6,"fx":"西风","fl":"3级","type":"小雨","notice":"雨虽小，注意保暖别感冒"},{"date":"12","high":"高温 30℃","low":"低温 19℃","ymd":"2020-07-12","week":"星期日","sunrise":"04:56","sunset":"19:44","aqi":28,"fx":"西南风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"13","high":"高温 32℃","low":"低温 21℃","ymd":"2020-07-13","week":"星期一","sunrise":"04:57","sunset":"19:43","aqi":25,"fx":"西风","fl":"2级","type":"晴","notice":"愿你拥有比阳光明媚的心情"},{"date":"14","high":"高温 34℃","low":"低温 21℃","ymd":"2020-07-14","week":"星期二","sunrise":"04:58","sunset":"19:43","aqi":56,"fx":"南风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"15","high":"高温 31℃","low":"低温 21℃","ymd":"2020-07-15","week":"星期三","sunrise":"04:59","sunset":"19:42","aqi":74,"fx":"东南风","fl":"2级","type":"多云","notice":"阴晴之间，谨防紫外线侵扰"},{"date":"16","high":"高温 35℃","low":"低温 21℃","ymd":"2020-07-16","week":"星期四","sunrise":"04:59","sunset":"19:41","aqi":85,"fx":"东南风","fl":"2级","type":"中雨","notice":"记得随身携带雨伞哦"}]
         */

        private String shidu;
        private double pm25;
        private double pm10;
        private String quality;
        private String wendu;
        private String ganmao;
        private List<ForecastBean> forecast;

        public String getShidu() {
            return shidu;
        }

        public void setShidu(String shidu) {
            this.shidu = shidu;
        }

        public double getPm25() {
            return pm25;
        }

        public void setPm25(double pm25) {
            this.pm25 = pm25;
        }

        public double getPm10() {
            return pm10;
        }

        public void setPm10(double pm10) {
            this.pm10 = pm10;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public String getWendu() {
            return wendu;
        }

        public void setWendu(String wendu) {
            this.wendu = wendu;
        }

        public String getGanmao() {
            return ganmao;
        }

        public void setGanmao(String ganmao) {
            this.ganmao = ganmao;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        public static class ForecastBean {
            /**
             * date : 03
             * high : 高温 27℃
             * low : 低温 21℃
             * ymd : 2020-07-03
             * week : 星期五
             * sunrise : 04:51
             * sunset : 19:47
             * aqi : 97
             * fx : 东北风
             * fl : 1级
             * type : 中雨
             * notice : 记得随身携带雨伞哦
             */

            private String date;
            private String high;
            private String low;
            private String ymd;
            private String week;
            private String sunrise;
            private String sunset;
            private int aqi;
            private String fx;
            private String fl;
            private String type;
            private String notice;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getHigh() {
                return high;
            }

            public void setHigh(String high) {
                this.high = high;
            }

            public String getLow() {
                return low;
            }

            public void setLow(String low) {
                this.low = low;
            }

            public String getYmd() {
                return ymd;
            }

            public void setYmd(String ymd) {
                this.ymd = ymd;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getSunrise() {
                return sunrise;
            }

            public void setSunrise(String sunrise) {
                this.sunrise = sunrise;
            }

            public String getSunset() {
                return sunset;
            }

            public void setSunset(String sunset) {
                this.sunset = sunset;
            }

            public int getAqi() {
                return aqi;
            }

            public void setAqi(int aqi) {
                this.aqi = aqi;
            }

            public String getFx() {
                return fx;
            }

            public void setFx(String fx) {
                this.fx = fx;
            }

            public String getFl() {
                return fl;
            }

            public void setFl(String fl) {
                this.fl = fl;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }
        }
    }



}
