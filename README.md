# blockoid

A thin Clojurescript wrapping of [Blockly](https://developers.google.com/blockly/), a library for building Scratch-like interfaces in the browser.

The combination of Blockly and Clojure allows for the easy creation of powerful combinatorial user interfaces and visual languages. See [this presentation](https://drive.google.com/file/d/1Jfc94u42BDqmwSFDazTplDfVjzc1eVej/view?usp=sharing) for a real-world example of use.

![screenshot](doc/image1.png)

## Status

This branch is an attempt to move away from cljsjs pacakge managment to shadow-cljs. Not yet working!

## Usage

This version is designed to be used with shadow-cljs and installed via npm.

See [the example](example/project.clj) for details. 

In your code, add the `require`:

```clojure
(ns ...
  (:require ["blockoid" :as b]))
```

Usage details are in (a separate document)[doc/blockoid.md].

## License

Relased under MIT license. See the [LICENSE](LICENSE.md) file for details.

### One-time setup

    brew install npm
	npm install -g shadow-cljs

    npm install

### Building the librariy

    shadow-cljs compile lib

### Installing for local use

    npm link
	
See here for other techniques: https://medium.com/@debshish.pal/publish-a-npm-package-locally-for-testing-9a00015eb9fd

I think npm pack might be worth trying

### Installing for global use

    
### Running example

    cd example
	npm link blockoid
    shadow-cljs compile app
	
TODO can't get a compile to work	
