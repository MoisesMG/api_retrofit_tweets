package uca.app.api;

import java.util.List;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import uca.app.models.AccesTokenModel;
import uca.app.models.TweetModel;
import uca.app.models.UserModel;


public interface ApiInterface {
    @GET("tweets")
    Call<List<TweetModel>> getTweets(@Header("Authorization") String accesToken);

    @POST("tweets")
    Call<TweetModel> setTweet(@Body TweetModel tweetModel);

    @POST("Users")
    Call<UserModel> signUp(@Body UserModel userModel);

    @POST("Users/login")
    Call<AccesTokenModel> signIn(@Body UserModel userModel);


    @PUT("tweets/{id}")
    Call<TweetModel> editTweet(@Path("id") String id, @Body TweetModel tweetModel);
}

















