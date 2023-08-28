# srt Project

**SALARY RANGE TOOL**
With the new directives for salary transparency this tool can give a visual dashboard of your team.

## Running the application

To run the application (a simple, single web page) you just need to use a local web server to serve the pages, it can be done with two simle steps:

### Step 1 - put files in your web server root directory

This can be done cloning the GIT repo directly in your root directory, for example:

```in a shell window
cd /usr/share/nginx/html
git clone https://github.com/aleoncini/srt.git
```

### Step 2 - create a configuration file

The app needs a file named "config.json" in the directory with index.html, you can use the template file named template.json and editing examples with real values:

```in the previous shell window
cp template.json config.json
vi config.json
```

Now you can use the application opening the page at the URL: ([SRT Home](http://localhost/srt))

NOTE: in case your web server is bind on a different port than 80 specify the url accordingly (http://[host]:[port]/srt)