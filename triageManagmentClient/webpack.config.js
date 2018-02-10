module.exports = {
   entry: './main.js',
   output: {
      filename: 'bundle.js'
   },
   module: {
      loaders: [
         {
            loader: 'babel-loader',
            test: /\.js$/,
            exclude: /node_modules/
         }
      ]
   },
   devServer: {
      port: 8000
   }
};


// var config = {
//    entry: './main.js',
//    output: {
//       path:'/',
//       filename: 'bundle.js',
//    },
//    devServer: {
//       inline: true,
//       port: 8080
//    },
//    module: {
//       loaders: [
//          {
//             test: /\.jsx?$/,
//             exclude: /node_modules/,
//             loader: 'babel-loader',
//             query: {
//                presets: ['es2015', 'react']
//             }
//          }
//       ]
//    }
// }
// module.exports = config;