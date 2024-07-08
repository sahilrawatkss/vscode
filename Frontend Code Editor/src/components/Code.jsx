import { useContext } from "react";

import Editor from "./Editor";

import Result from "./Result";

import { Box, styled } from "@mui/material";

import { DataContext } from "../context/DataProvider";

const ParentContainer = styled(Box)`
  display: flex;
  width :100%;
  height:100%;
`;

const Container = styled(Box)`
  background-color: #060606;
  height: 130vh;
  display: flex;
  flex-direction: column;
  width:75vh; //adding 
`;

const Code = () => {
  const { html, css, js, setHtml, setCss, setJs } = useContext(DataContext);

  return (
    <ParentContainer>
    <Container>
      <Editor
        heading="HTML"
        icon="/"
        color="#FF3C41"
        value={html}
        onChange={setHtml}
      />
      <Editor
        heading="Css"
        icon="*"
        color="#0EBEFF"
        value={css}
        onChange={setCss}
      />
      <Editor
        heading="Js"
        icon="{ }"
        color="#FCD000"
        value={js}
        onChange={setJs}
      />
    </Container>
    {<Result />}
    </ParentContainer>
  );
};

export default Code;
