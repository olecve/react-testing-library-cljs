module.exports = function (config) {
  config.set({
    browsers: ["ChromeHeadlessNoSandbox"],
    customLaunchers: {
      ChromeHeadlessNoSandbox: {
        base: "ChromeHeadless",
        flags: ["--no-sandbox"],
      },
    },
    // The directory where the output file lives
    basePath: "target",
    // The file itself
    files: ["karma-test.js"],
    frameworks: ["cljs-test"],
    plugins: [
      "karma-cljs-test",
      "karma-chrome-launcher",
      "karma-junit-reporter",
    ],
    colors: true,
    logLevel: config.LOG_INFO,
    client: {
      args: ["shadow.test.karma.init"],
    },
    // save junit test report to ./test-results/junit.xml
    junitReporter: {
      outputDir: "../test-results/",
      outputFile: "junit.xml",
      useBrowserName: false,
    },
  });
};
