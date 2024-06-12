let promise = new Promise((resolve, reject) => {
  const x = "hello";
  const y = "helloo";
  if (x == y) resolve(x);
  else reject("hi");
});

promise
  .then((e) => {
    console.log(e);
  })
  .catch((err) => {
    console.log(err);
  });
