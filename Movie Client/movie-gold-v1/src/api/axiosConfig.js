import axios from 'axios';

export default axios.create({
  baseURL: 'http://127.0.0.1:8080',

  //   headers: {
  //     'Access-Control-Allow-Origin': '*',
  //     'Access-Control-Allow-Credentials': true,
  //   },
});
