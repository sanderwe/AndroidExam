# AndroidExam, Reverse image searcher

Presentation of project / Usages for reverse image search:
Our app ReverseSearcher makes it possible for users to choose an image, upload it to the “exam” server and receive reverse searched images from Bing.com. 
The app uses a simple UI with a modern, dark design in which both buttons and text use slightly brighter colors than the background. 
(Sub requirement: Comprehensive design)

First package folder in res is drawable where we implemented different vectors for our app. Illustrations make it easier for users to understand
what’s going on or what is about to happen if something with an icon is pressed. Example: In Upload activity, the text view “Choose image from
gallery” has both a gallery icon and an upload icon, which tells the user that when the button is pressed they will have to choose an image to be uploaded.

The first activity activity_main isn’t actually the launch activity. The @GET request, which firstly downloaded the google logos (from this link:
http://api-edu.gtl.ai/api/v1/imagesearch/bing?url=https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png) was
the first option we implemented in our project. We tried to refactor it to some other name but then the whole project stopped working.
Activity_main2 is the actual launch screen. Adapter_image is the layout for the recycler view for the GET images, saved_images is an empty
layout, existing purely for design purposes. The upload layout is the most complex of them all, with a lot of functionality in both xml and kotlin files.
(Sub-Requirement 5 and 10)


# Classes

Most of the upload/post code lays in the Upload.kt file but some of the code can be found in classes RetrofitClient and API. Those two classes
work together and are responsible for uploading the image to the server. The @GET functionality uses a lot more classes. Most of the code can be
found in MainActivity but we needed additionally 6 other classes to make it work as we wanted it to. MainAdapter, MainViewModel, Model, Main
Repository and MyViewModelFactory are in charge of saving the images and displaying them in the recycler view (Sub-Requirement 4).
RetrofitService is a class in charge of only the request itself. Globals class is used for storing the variable and passing the url from Upload to
RetrofitService (dynamic URL). We tried to refactor all of the code to Kotlin but some files were just not cooperating (API and RetrofitService).
The RetrofitClient and Service have a lot in common and could be refactored in some ways but we simply did not have time to fix the bugs
that come with refactoring the code. (Sub-Requirement 3)


# Retrofit instead of android fast network

We started our project trying to use fast android networking(Sub requirement: Use third party libraries) but early on came to the
conclusion that even though it seemed easier in theory than retrofit it has less documentation and very few good youtube guides. We went on and
worked with retrofit which seemed older and had a lot of resources online. Libraries like fast android networking had a lot of features like JSON
parser and upload and download progress listeners built in while retrofit required some handling or building a “parser factory” in code. This we
would discover later down the road. We had built too much of the project to turn around and start from scratch with fast android networking so we
continued using retrofit even though it might have been harder in the long run.
Before we started coding we were looking at different library benchmark performances to ensure us that retrofit actually was a good performing
library. We came across this picture that does not include fast android networking but other networking libraries.

![image](https://user-images.githubusercontent.com/77743690/232487303-b13a068b-3085-4854-8823-0eb739f67fd2.png)

In this benchmark Retrofit came out on top and ensured us that retrofit was in fact a good performing library that both delivered on the features
we needed and had speed and optimization.


# Features we wanted to achieve but did not manage in time:

When we started the project we were struggling a lot in the first week trying to read documentation and wrapping our heads around the features
we had to implement into the app. But after a while we started to manage to get features implemented and functioning code that delivered both
pictures to the server, got the url from the image stored on server and could reverse image search the images on bing. But in the end there were
some features that we didn’t have time to implement. Right now our app only image searches on bing instead of all 3 options that were given in
the exam.

![image](https://user-images.githubusercontent.com/77743690/232487676-9ed889e6-f94d-4c36-92e7-f75d90f0aadb.png)

We built the code to search in bing but could easily be altered if wechanged “bing?” to for example “google?”. We just did not have time to
implement 2 more methods and buttons in the UI to search for all the 3 search engines.

We also wanted the user to be able to save the images that came back from the search either into their phone gallery or a database. This whole
feature was scrapped because of time management issues early on and struggling to progress the project. The server that we needed to post and
get from was occasionally down or not working. This also on some days made it harder to progress because it was hard to see if we did something
wrong in our code or if the server is just not operational at this very moment. The app is now purely a reverse searching app. You can upload
images to a server and do reverse searches and view the images that the server responds with in a recyclerview.


