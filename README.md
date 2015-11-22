# binary-clock

A binary clock in Hoplon

## Dependencies

- java 1.7+
- [boot][1]
- [leiningen][2]

## Usage
### Development
1. Start the `dev` task. In a terminal run:
    ```bash
    $ boot dev
    ```
    This will give you a  Hoplon development setup with:
    - auto compilation on file changes
    - audible warning for compilation success or failures
    - auto reload the html page on changes
    - Clojurescript REPL

2. Go to [http://localhost:8000][3] in your browser. You should see "Hello, Hoplon!".

3. If you edit and save a file, the task will recompile the code and reload the
   browser to show the updated version.

4. You're already done.

## License

Copyright © 2014, 2015, Paul Bauer

The use and distribution terms for this software are covered by the Eclipse
Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php) which can
be found in the file epl-v10.html at the root of this distribution. By using
this software in any fashion, you are agreeing to be bound by the terms of
this license. You must not remove this notice, or any other, from this software.

[1]: http://boot-clj.com
[2]: http://localhost:8000
[3]: http://hoplon.io
