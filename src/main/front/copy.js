var fs = require('fs');
var path = require('path');
var glob = require('glob');
var mkdirp = require('mkdirp');

function copyFile(srcFilePath, dstFilePath) {
  fs.stat(path.dirname(dstFilePath), (err, stat) => {
    if (err) {
      if (err.code === 'ENOENT') {
        mkdirp(path.dirname(dstFilePath), (err) => {
          if (err) {
            console.error(err);
          } else {
            fs.createReadStream(srcFilePath).pipe(fs.createWriteStream(dstFilePath));
          }
        });
      }
    } else {
      fs.createReadStream(srcFilePath).pipe(fs.createWriteStream(dstFilePath));
    }
  });
}

function copyIndexFile(srcFilePath) {
  const dstFilePath = srcFilePath.replace(/\.\/build\//g, "../resources/templates/");
  copyFile(srcFilePath, dstFilePath);
}

function copyFileToWebapp(srcFilePath) {
  const dstFilePath = srcFilePath.replace(/\.\/build\//g, "../webapp/");
  copyFile(srcFilePath, dstFilePath);
}

glob("./build/**/*.html", (err, files) => {
  if (err) {
    console.error(err);
  }
  for (const file of files) {
    copyIndexFile(file);
  }
});

glob("./build/**/*.*", {ignore: ["./build/**/*.html"]}, (err, files) => {
  if (err) {
    console.error(err);
  }
  for (const file of files) {
    copyFileToWebapp(file);
  }
});
